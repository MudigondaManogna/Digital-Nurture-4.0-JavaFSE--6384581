import React from 'react';

const IndianPlayers = () => {
  const indianTeam = ['Sachin', 'Dhoni', 'Rohit', 'Virat', 'Shreyas', 'Raina'];

  const oddPlayers = indianTeam.filter((player, index) => index % 2 === 0);  
  const evenPlayers = indianTeam.filter((player, index) => index % 2 !== 0); 

  const T20players = ['Mr. First Player', 'Mr. Second Player', 'Mr. Third Player'];
  const RanjiPlayers = ['Mr. Fourth Player', 'Mr. Fifth Player', 'Mr. Sixth Player'];

  const mergedPlayers = [...T20players, ...RanjiPlayers];

  return (
    <div>
      <h2>Odd Players</h2>
      <ul>
        {oddPlayers.map((player, i) => (
          <li key={i}>{player}</li>
        ))}
      </ul>

      <h2>Even Players</h2>
      <ul>
        {evenPlayers.map((player, i) => (
          <li key={i}>{player}</li>
        ))}
      </ul>

      <hr />

      <h2>List of Indian Players Merged:</h2>
      <ul>
        {mergedPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;
