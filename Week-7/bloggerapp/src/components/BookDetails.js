import React from "react";
import { FaBookOpen } from "react-icons/fa";

const BookDetails = () => {
  return (
    <div style={{ flex: 1, borderLeft: "3px solid green", paddingLeft: "30px" }}>
      <h2><FaBookOpen /> Book Details</h2>
      <p><strong>Master React</strong></p>
      <p>670</p>
      <p><strong>Deep Dive into Angular 11</strong></p>
      <p>800</p>
      <p><strong>Mongo Essentials</strong></p>
      <p>450</p>
    </div>
  );
};

export default BookDetails;
