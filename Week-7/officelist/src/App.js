import React from 'react';
import OfficeList from './components/OfficeList';
import './App.css';

function App() {
  const images = [
    { src: 'https://media.istockphoto.com/id/1591225732/photo/modern-open-plan-office-space-with-tables-office-chairs-creeper-plants-and-manager-room.jpg?s=612x612&w=0&k=20&c=E4eoy343CGfIbbpJXE0jJogXsHdJP2AWpeZ5fSI-ltk=', width: 150 },
    { src: 'https://www.decorilla.com/online-decorating/wp-content/uploads/2023/05/correcto.jpg', width: 200 },
    { src: 'https://d8it4huxumps7.cloudfront.net/uploads/images/opportunity/mobile_banner/63244f574df8c_software-engineer.jpg?d=700x400', width: 300 }, 
    { src: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSN34V3DfK-1pscUaQ6a8Fo9nNwHsFLpXgy_A&s', width: 200 },
    { src: 'https://officebanao.com/wp-content/uploads/2024/06/office-with-lot-desks-computers-1200x799.jpg', width: 150 },
  ];

  return (
    <div className="App">
      <h1>Office Space Rental App</h1>

      <div
        style={{
          display: 'flex',
          justifyContent: 'center',
          alignItems: 'center',
          gap: '15px',
          flexWrap: 'wrap',
          margin: '30px 0',
        }}
      >
        {images.map((img, index) => (
          <img
            key={index}
            src={img.src}
            alt={`office-${index + 1}`}
            style={{ width: `${img.width}px`, borderRadius: '8px' }}
          />
        ))}
      </div>

      <OfficeList />
    </div>
  );
}

export default App;
