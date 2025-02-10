-- data.sql

INSERT INTO cart (user_id, product_id) VALUES ('user123', '101');
INSERT INTO cart (user_id, product_id) VALUES ('user456', '109');
INSERT INTO cart (user_id, product_id) VALUES ('user789', '110');
INSERT INTO cart (user_id, product_id) VALUES ('userabc', '101'); -- Example of multiple users with the same product
INSERT INTO cart (user_id, product_id) VALUES ('userxyz', '999'); -- Example of a user with a potentially invalid product ID (for testing 404)

-- Add more sample data as needed