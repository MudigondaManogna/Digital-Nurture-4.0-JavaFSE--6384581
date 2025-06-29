CREATE TABLE Employees (
    EmpID NUMBER PRIMARY KEY,
    EmpName VARCHAR2(100),
    Department VARCHAR2(50),
    Salary NUMBER(10, 2)
);

INSERT INTO Employees VALUES (101, 'John', 'HR', 30000);
INSERT INTO Employees VALUES (102, 'Ravi', 'HR', 35000);
INSERT INTO Employees VALUES (103, 'Neha', 'IT', 40000);
INSERT INTO Employees VALUES (104, 'Kiran', 'IT', 42000);
COMMIT;
CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
    p_dept_name IN VARCHAR2,
    p_bonus_pct IN NUMBER
) IS
    v_rows_updated NUMBER;
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * p_bonus_pct / 100)
    WHERE Department = p_dept_name;

    v_rows_updated := SQL%ROWCOUNT;

    DBMS_OUTPUT.PUT_LINE('Updated bonus for ' || v_rows_updated || 
                         ' employee(s) in department ' || p_dept_name || 
                         ' with ' || p_bonus_pct || '% bonus.');

    COMMIT;
END;
/
BEGIN
    UpdateEmployeeBonus('HR', 10); -- 10% bonus to HR department
END;
/