import React, { useState } from 'react';
import CurrencyConvertor from './components/CurrencyConvertor';

function App() {
  const [count, setCount] = useState(1);

  const decrement = () => {
    setCount(prev => prev - 1);
  };

  const sayWelcome = () => {
    alert("Hello Member welcome!");
  };

  const handleClick = () => {
    alert("I was clicked");
  };

  return (
    <div style={{ padding: '20px' }}>
      <div>{count}</div>
      <button onClick={() => setCount(prev => prev + 1)}>Increment</button>
      <button onClick={decrement}>Decrement</button>
      <br /><br />
      <button onClick={sayWelcome}>Say welcome</button>
      <br /><br />
      <button onClick={handleClick}>Click on me</button>

      <CurrencyConvertor />
    </div>
  );
}

export default App;
