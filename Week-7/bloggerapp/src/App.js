import React, { useState } from "react";
import CourseDetails from "./components/CourseDetails";
import BookDetails from "./components/BookDetails";
import BlogDetails from "./components/BlogDetails";
import { FaRegNewspaper } from "react-icons/fa";

function App() {
  const [showCourses, setShowCourses] = useState(true);
  const [showBooks, setShowBooks] = useState(true);
  const [showBlogs, setShowBlogs] = useState(false);

  return (
    <div style={{ padding: "20px" }}>
      <h1><FaRegNewspaper style={{ color: "blue" }} /> Blogger App</h1>
      <button onClick={() => setShowCourses(prev => !prev)}>
        {showCourses ? "Hide" : "Show"} Course Details
      </button>
      <button onClick={() => setShowBooks(prev => !prev)}>
        {showBooks ? "Hide" : "Show"} Book Details
      </button>
      <button onClick={() => setShowBlogs(prev => !prev)}>
        {showBlogs ? "Hide" : "Show"} Blog Details
      </button>

      <div style={{ display: "flex", marginTop: "20px", gap: "30px" }}>
        {showCourses && <CourseDetails />}
        {showBooks && <BookDetails />}
        {showBlogs && <BlogDetails />}
      </div>
    </div>
  );
}

export default App;
