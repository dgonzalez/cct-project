const express = require('express')
const app = express()

app.use(express.static('static'))

app.get('/api/timestamp', (req, res) => {
  // fill me
  res.send('Here is where the action happens')
})

// Add another handler for GMT dates


// Start the server:
app.listen(3000, () => {
  console.log('Server started in port 3000')
})
