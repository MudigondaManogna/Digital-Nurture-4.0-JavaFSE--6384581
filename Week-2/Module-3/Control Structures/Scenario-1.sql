DECLARE
    CURSOR customer_cursor IS
        SELECT CustomerID, InterestRate
        FROM Customers
        WHERE Age > 60;

BEGIN
    FOR customer_rec IN customer_cursor LOOP
        UPDATE Customers
        SET InterestRate = InterestRate - 1
        WHERE CustomerID = customer_rec.CustomerID;
    END LOOP;
    
    COMMIT;
END;
