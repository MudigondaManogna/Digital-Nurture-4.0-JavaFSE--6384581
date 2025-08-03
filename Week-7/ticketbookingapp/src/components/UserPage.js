import React from 'react';

function UserPage({ onLogout }) {
  const flightData = [
    { id: 1, flight: "AI202", from: "Delhi", to: "Mumbai", time: "10:30 AM" },
    { id: 2, flight: "AI203", from: "Bangalore", to: "Hyderabad", time: "2:00 PM" },
    { id: 3, flight: "AI204", from: "Chennai", to: "Kolkata", time: "6:15 PM" },
  ];

  const handleBook = (flight) => {
    alert(`Ticket booked for flight ${flight.flight} from ${flight.from} to ${flight.to}`);
  };

  return (
    <div>
      <h2>Welcome, User!</h2>
      <p>You can now book tickets below:</p>

      <table border="1" cellPadding="10" style={{ marginBottom: "20px" }}>
        <thead>
          <tr>
            <th>Flight</th>
            <th>From</th>
            <th>To</th>
            <th>Time</th>
            <th>Action</th>
          </tr>
        </thead>
        <tbody>
          {flightData.map(flight => (
            <tr key={flight.id}>
              <td>{flight.flight}</td>
              <td>{flight.from}</td>
              <td>{flight.to}</td>
              <td>{flight.time}</td>
              <td>
                <button onClick={() => handleBook(flight)}>Book</button>
              </td>
            </tr>
          ))}
        </tbody>
      </table>

      <button onClick={onLogout}>Logout</button>
    </div>
  );
}

export default UserPage;
