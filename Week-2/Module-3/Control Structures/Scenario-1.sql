CREATE TABLE Customers (
    CustomerID NUMBER PRIMARY KEY,
    Name VARCHAR2(100),
    Age NUMBER,
    InterestRate NUMBER
);
INSERT INTO Customers (CustomerID, Name, Age, InterestRate)
VALUES (1, 'Alice', 65, 5);

INSERT INTO Customers (CustomerID, Name, Age, InterestRate)
VALUES (2, 'Bob', 58, 4);

INSERT INTO Customers (CustomerID, Name, Age, InterestRate)
VALUES (3, 'Charlie', 72, 6);

INSERT INTO Customers (CustomerID, Name, Age, InterestRate)
VALUES (4, 'David', 45, 4);

INSERT INTO Customers (CustomerID, Name, Age, InterestRate)
VALUES (5, 'Eve', 68, 7);

COMMIT;
SET SERVEROUTPUT ON;

DECLARE
    CURSOR customer_cursor IS
        SELECT CustomerID, InterestRate
        FROM Customers
        WHERE Age > 60;

    v_newRate NUMBER;

BEGIN
    FOR customer_rec IN customer_cursor LOOP   
        v_newRate := customer_rec.InterestRate - 1;

        UPDATE Customers
        SET InterestRate = v_newRate
        WHERE CustomerID = customer_rec.CustomerID;
        DBMS_OUTPUT.PUT_LINE('Updated CustomerID: ' || customer_rec.CustomerID ||
                             ' | New InterestRate: ' || v_newRate);
    END LOOP;
    
    COMMIT;
END;
/
