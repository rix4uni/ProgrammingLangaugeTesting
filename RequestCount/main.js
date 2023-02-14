const https = require('https');

const url = "https://www.dell.com";

for (let i = 0; i < 1000; i++) {
    https.get(url, (res) => {
        console.log(res.statusCode);
    });
}