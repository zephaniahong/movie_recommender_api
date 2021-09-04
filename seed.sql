\COPY movies FROM '/Users/zephaniahong/Desktop/movie_recommender_api/cleaned_movies.csv' DELIMITER ',' CSV HEADER;
    
\COPY ratings FROM '/Users/zephaniahong/Desktop/movie_recommender_api/cleaned_ratings.csv' DELIMITER ',' CSV HEADER;