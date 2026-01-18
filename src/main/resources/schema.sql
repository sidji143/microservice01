CREATE TABLE question (
    id INT PRIMARY KEY AUTO_INCREMENT,
    category VARCHAR(100),
    difficulty_level VARCHAR(50),
    option1 VARCHAR(100),
    option2 VARCHAR(100),
    option3 VARCHAR(100),
    option4 VARCHAR(100),
    question_title TEXT,
    right_answer VARCHAR(100),
    version INT DEFAULT 0
);


