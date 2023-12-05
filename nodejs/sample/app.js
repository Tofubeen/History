const express = require('express')
const app = express()
const port = 3000

// 라우팅 경로 설정: 스프링 Controller에서 매핑주소 설정과 유사(매핑은 라우팅과 유사)
app.get('/', (req, res) => {
  res.send('Hello World!')
})

app.get('/testA', (req, res) => {
  res.sendA()("testA")
});

// 서버 구동
app.listen(port, () => {
  console.log(`Example app listening on port ${port}`)
})

