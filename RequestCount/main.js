const fetch = require('node-fetch');

const url = "https://www.dell.com";

for (let i = 0; i < 1000; i++) {
  fetch(url)
    .then(response => console.log(response.status));
}