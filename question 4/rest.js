const https = require("https");

const options = {
    "method": "GET",
    "hostname": "my-json-server.typicode.com",
    "port": 80,
    "path": "/typicode/demo/posts",
    "headers": {
        "x-dreamfactory-api-key": "https://my-json-server.typicode.com/typicode/demo/posts",
        "cache-control": "no-cache"
    }
}

const req = https.request(options, function(res) {

    var chunks = [];

    res.on("data", function (chunk) {
        chunks.push(chunk);
    });

    res.on("end", function() {
        var body = Buffer.concat(chunks);
        console.log(body.toString());
    });

});

req.end()