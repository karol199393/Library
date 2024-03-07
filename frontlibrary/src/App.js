import React, { useState, useEffect } from 'react';
import logo from './logo.svg';
import './App.css';
import axios from 'axios';

function App() {
  const [books, setBooks] = useState([]);

  useEffect(() => {

    axios.get('http://localhost:8081/books')
      .then(response => {
        setBooks(response.data); // Ustaw dane w stanie komponentu
      })
      .catch(error => {
        console.error('There was a problem with the axios request:', error);
      });
  }, []);  // Użyj pustej tablicy zależności, aby useEffect został wykonany tylko raz przy montowaniu komponentu

  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <ul>
          {books.map(book => (
            <li key={book.id}>{book.title}</li>
          ))}
        </ul>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
    </div>
  );
}

export default App;
