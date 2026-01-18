INSERT INTO question (id, category, difficulty_level, option1, option2, option3, option4, question_title, right_answer, version) VALUES
(1, 'Java', 'Easy', 'C++', 'Java', 'Python', 'Ruby', 'What programming language is primarily used for Android development?', 'Java', 0),
(2, 'Java', 'Easy', 'JVM', 'JRE', 'JDK', 'JAVAC', 'Which one is the Java Virtual Machine?', 'JVM', 0),
(3, 'Java', 'Medium', 'Static', 'Dynamic', 'Both', 'None', 'In Java, method overloading is an example of __________ polymorphism.', 'Static', 0),
(4, 'Java', 'Medium', 'Encapsulation', 'Inheritance', 'Polymorphism', 'Abstraction', 'What is the main feature of Object-Oriented Programming?', 'Encapsulation', 0),
(5, 'Java', 'Easy', 'new', 'this', 'super', '', '', '', 0),
(6, 'Python', 'Hard', 'Checked Exception', 'Unchecked Exception', 'Error', 'Throwable', 'In Java, which type of exception is not checked at compile-time?', 'Unchecked Exception', 0),
(7, 'Python', 'Hard', 'synchronized', 'volatile', 'transient', 'native', 'Which keyword in Java is used to indicate that a method can be accessed by only one thread at a time?', 'synchronized', 0);

-- Restart the ID sequence so Hibernate can insert new rows safely
ALTER TABLE question ALTER COLUMN id RESTART WITH 8;