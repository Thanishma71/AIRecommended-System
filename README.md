# AIRecommended-System

"Company":CODTECH IT Solutions

Name: Bezawada Thanishma

Intern ID:CT04DN1543

"DOmain":JAVA Programming

"Duration":8 weeks

"Mentor":Neela Santhosh Kumar

Description: This project involves the development of a user-based recommendation system using Apache Mahout, a machine learning library designed for scalable data mining tasks. The core objective is to provide personalized recommendations to users by analyzing and identifying similarities in user preferences. The system uses a simple CSV file (data.csv) containing user IDs, item IDs, and corresponding ratings as input. Leveraging Mahout’s FileDataModel, the application loads the data and computes similarity between users using Pearson Correlation Similarity. It then identifies a neighborhood of similar users with the NearestNUserNeighborhood algorithm. Based on this, Mahout’s GenericUserBasedRecommender generates recommendations by analyzing what similar users have rated highly but the current user hasn’t interacted with yet. The application is implemented in Java, with key dependencies including mahout-core, mahout-math, slf4j-api, commons-math3, and guava. Throughout the development, multiple dependencies were resolved and configured properly using the -cp classpath parameter. An important aspect encountered during testing was the sparsity of data; meaningful recommendations require sufficient overlap in user-item interactions, which in small datasets may result in fewer or no suggestions. Despite these challenges, the project effectively demonstrates how collaborative filtering works by simulating a basic yet functional recommender engine. This approach mirrors recommendation strategies employed by platforms like Amazon and Netflix, where users receive suggestions based on behavior patterns of similar users. Though designed for a small dataset, the solution is scalable, and Mahout's architecture allows for expansion into big data environments using tools like Hadoop. This project showcases the practical application of machine learning in solving real-world problems such as content personalization, and it highlights the importance of well-structured data and appropriate algorithm selection for accurate and efficient results.

OUTPUT:
<img width="956" alt="Image" src="https://github.com/user-attachments/assets/db2184fc-5200-47d9-b94f-f897833280c4" />
