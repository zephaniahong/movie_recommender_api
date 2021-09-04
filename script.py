import csv
import pandas as pd
# -------------------------------------------------------------------------------
# Clean datasets - movies and ratings

# 1st stage:
# To qualify a movie, a minimum of 10 users should have voted for that movie

# 2nd stage:
# To qualify a user, a minimum of 50 movies should have been voted by that user
# -------------------------------------------------------------------------------



# global variables
first_stage_clean = []
users = {} # userId: number of ratings given
cleaned_users = {}
movie_counter = {} # movieId: number of ratings received
cleaned_ratings = []
cleaned_movies = []

# CLEANING RATINGS.CSV

# delete timestamp column
rating_data = pd.read_csv('ratings.csv')
rating_data.drop('timestamp', axis=1, inplace=True)
raw_data = rating_data.values.tolist()

# populate users dict and movie counter
for row in raw_data:
  if row[0] not in users:
    users[row[0]] = 1
  elif row[0] in users:
    users[row[0]] += 1  
  if row[1] not in movie_counter:
    movie_counter[row[1]] = 1
  elif row[1] in movie_counter:
    movie_counter[row[1]] += 1
  row[2] = round((row[2] - 0.5) / (5-0.5),4) # normalize rating scale from 1 - 5 to 0 - 1

# add key, value pairs of those that meet the requirement from users to cleaned_users
for userId in users:
  if users[userId] >= 50:
    cleaned_users[userId] = users[userId]

# add qualified users' ratings to first_stage_clean
for row in raw_data:
  if row[0] in cleaned_users:
    first_stage_clean.append(row)

# add data from first_stage_clean to cleaned_ratings if the movie appears at least 10 times
for row in first_stage_clean:
  if movie_counter[row[1]] >= 10:
    cleaned_ratings.append(row)

# write cleaned_ratings list into new csv file
ratings_fields = ['userId', 'movieId', 'rating']
with open('cleaned_ratings.csv', 'w') as f:
  write = csv.writer(f)
  write.writerow(ratings_fields)
  write.writerows(cleaned_ratings)


# CLEANING MOVIES.CSV

# remove genres column
movie_data = pd.read_csv('movies.csv')
movie_data.drop('genres', axis=1, inplace=True)

raw_movies = movie_data.values.tolist()

# add movies that received at least 10 ratings to cleaned_movies
for movie in raw_movies:
  if movie[0] in movie_counter:
    if movie_counter[movie[0]] > 10:
      cleaned_movies.append(movie)

# write cleaned_movies list into new csv file
movie_fields = ['movieId', 'title']
with open('cleaned_movies.csv', 'w') as f:
  write = csv.writer(f)
  write.writerow(movie_fields)
  write.writerows(cleaned_movies)

    
