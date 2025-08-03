import React from "react";
import { FaBloggerB } from "react-icons/fa";

const BlogDetails = () => {
  return (
    <div style={{ flex: 1, borderLeft: "3px solid green", paddingLeft: "30px" }}>
      <h2><FaBloggerB /> Blog Details</h2>
      <p><strong>React Learning</strong></p>
      <p><em>Stephen Biz</em></p>
      <p>Welcome to learning React!</p>
      <p><strong>Installation</strong></p>
      <p><em>Schwezdenier</em></p>
      <p>You can install React from npm.</p>
    </div>
  );
};

export default BlogDetails;
