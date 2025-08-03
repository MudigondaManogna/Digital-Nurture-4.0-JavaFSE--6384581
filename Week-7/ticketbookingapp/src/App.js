import React, { useState } from 'react';
import GuestPage from './components/GuestPage';
import UserPage from './components/UserPage';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLogin = () => {
    alert("Successfully Logged In");
    setIsLoggedIn(true);
  };

  const handleLogout = () => {
    alert("Successfully Logged Out");
    setIsLoggedIn(false);
  };

  return (
    <div style={{ padding: '20px' }}>
      <h1>✈️ Ticket Booking App</h1>
      {isLoggedIn ? (
        <UserPage onLogout={handleLogout} />
      ) : (
        <GuestPage onLogin={handleLogin} />
      )}
    </div>
  );
}

export default App;
