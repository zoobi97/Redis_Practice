**Redis Practice Projects**

Introduction
Redis (Remote Dictionary Server) is an in-memory data structure store used as a database, cache, and message broker. It supports data structures such as strings, hashes, lists, sets, sorted sets, bitmaps, hyperloglogs, and geospatial indexes. Due to its high-speed performance, Redis is widely used in modern applications to improve scalability and responsiveness.

This repository contains three practice projects demonstrating different use cases of Redis:

1. Redis as a Database  
2. Redis for Caching  
3. Redis as a Messaging Queue  

 🔧 Prerequisites
Before running the projects, ensure you have Redis Server installed and running.

 Install Redis on Linux/macOS:
sh
sudo apt update && sudo apt install redis -y   Ubuntu/Debian
brew install redis   macOS (Homebrew)

Install Redis on Windows:
Download Redis for Windows from [Memurai](https://www.memurai.com/) or use WSL (Windows Subsystem for Linux) to install Redis.

Start Redis Server:
sh
redis-server

Verify installation:
sh
redis-cli ping

Expected response: `PONG`

🚀 Project Overview

 1️⃣ Redis as a Database
This project demonstrates how to use Redis as a primary database to store and retrieve key-value pairs efficiently.
- Implements CRUD operations.
- Uses `RedisTemplate` to interact with Redis.
- Stores objects in Redis using hash structures.

📌 Configuration File: `RedisConfig.java`

 2️⃣ Redis for Caching
This project showcases Redis as a caching layer to reduce database load and improve response time.
- Caches frequently accessed data to improve performance.
- Implements Spring Boot caching with `@Cacheable` and `@CacheEvict` annotations.
- Demonstrates condition to cache particular data.

📌 Configuration File: `RedisConfig.java`

 3️⃣ Redis as a Messaging Queue
This project uses Redis Pub/Sub (Publish-Subscribe) to enable message-based communication between microservices.
- Uses Redis channels for real-time messaging.
- Implements Publisher-Subscriber pattern.
- Demonstrates message broadcasting with Redis.

📌 Configuration File: `RedisConfig.java`

 ⚡ How to Run
Each project has its own directory. Navigate to a project folder and execute:
sh
mvn spring-boot:run   For Maven projects
Ensure Redis is running before launching any project.

🤝 Contributing
Feel free to fork this repository, make improvements, and submit a pull request!

📬 Contact
For any queries or discussions, reach out via zohaib89769@gmail.com OR [GitHub Issues](https://github.com/your-repo/issues).
Happy Coding! 🚀

