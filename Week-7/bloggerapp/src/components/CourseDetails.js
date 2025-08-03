import React from "react";
import { FaGraduationCap } from "react-icons/fa";

const CourseDetails = () => {
  return (
    <div style={{ flex: 1 }}>
      <h2><FaGraduationCap /> Course Details</h2>
      <p><strong>Angular</strong></p>
      <p>4/5/2021</p>
      <p><strong>React</strong></p>
      <p>6/3/2021</p>
    </div>
  );
};

export default CourseDetails;
