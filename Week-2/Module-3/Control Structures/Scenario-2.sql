DECLARE
    CURSOR balance_cursor IS
        SELECT CustomerID
        FROM Customers
        WHERE Balance > 10000;

BEGIN
    FOR bal_rec IN balance_cursor LOOP
        UPDATE Customers
        SET IsVIP = 'TRUE'
        WHERE CustomerID = bal_rec.CustomerID;
    END LOOP;
    
    COMMIT;
END;
