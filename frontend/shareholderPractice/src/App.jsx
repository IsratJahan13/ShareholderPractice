import { useState, useEffect } from 'react'

import './App.css'

function App() {
  const [message, setMessage] = useState("");

  useEffect(() => {
    fetch('http://localhost:8080/api/home')
      .then(response => response.text())
      .then(data => setMessage(data))
      .catch(error => console.error('Error fetching data:', error));
  }, []);


  return (
    <div>
      <h1>{message}</h1>
    </div>
  )
}

export default App
