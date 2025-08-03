import React from 'react';

const OfficeList = () => {
  const officeSpaces = [
    { name: 'Tech Park', rent: 55000, address: 'Bangalore' },
    { name: 'Business Hub', rent: 75000, address: 'Hyderabad' },
    { name: 'Startup Space', rent: 45000, address: 'Chennai' }
  ];

  return (
    <div>
      <h2>Available Spaces:</h2>
      <ul>
        {officeSpaces.map((office, index) => (
          <li key={index}>
            <strong>Name:</strong> {office.name} <br />
            <strong>Address:</strong> {office.address} <br />
            <strong>Rent:</strong> ₹{office.rent}
            <br /><br />
          </li>
        ))}
      </ul>
    </div>
  );
};

export default OfficeList;
