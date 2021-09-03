import csv

"""
Clean dataset

1st stage:
To qualify a movie, a minimum of 10 users should have voted for that movie

2nd stage:
To qualify a user, a minimum of 50 movies should have been voted by that user

"""

raw_data = []
first_clean = []
users = {}
cleaned_users = {}
movie_counter = {}
cleaned_data = []
with open('ratings.csv') as ratings:
  ratings_reader = csv.reader(ratings, delimiter=',')
  raw_data = list(ratings_reader)

# populate users dict with number of votes given for each userId
for row in raw_data:
  if row[0] not in users:
    users[row[0]] = 1
  elif row[0] in users:
    users[row[0]] += 1  
  if row[1] not in movie_counter:
    movie_counter[row[1]] = 1
  elif row[1] in movie_counter:
    movie_counter[row[1]] += 1
  

# add key, value pairs of those that meet the requirement from users to cleaned_users
for userId in users:
  if users[userId] >= 50:
    cleaned_users[userId] = users[userId]

# add qualified users' ratings to first_clean
for row in raw_data:
  if row[0] in cleaned_users:
    first_clean.append(row)

# add data from first_clean to cleaned_data if the movie appears at least 10 times
for row in first_clean:
  if movie_counter[row[1]] >= 10:
    cleaned_data.append(row)

print(len(cleaned_data))




    
