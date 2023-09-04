# Write your MySQL query statement below
# Select firstName,lastName,,city,state 
# From Person
# LEFT JOIN Address
# Person.personId=Address.personId;
SELECT Person.firstName, Person.lastName, Address.city, Address.state
FROM Person
LEFT JOIN Address ON Person.personId = Address.personId;