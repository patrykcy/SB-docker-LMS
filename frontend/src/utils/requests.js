const API_URL = import.meta.env.VITE_BE_API_URL || 'http://localhost:8088'

const HEADERS = {
  'Content-Type': 'application/json',
  'Accept': 'application/json'
}

export async function getTime() {
  try {
    const response = await fetch(API_URL+'/api/time', {
      method: 'GET',
      headers: {...HEADERS}
    })
    const {timestamp} = await response.json()
    return timestamp
  } catch (error) {
    console.log(error)
    return "error"
  }
}

export async function addNumbers(firstNum, secondNum) {
  try {
    const requestBody = JSON.stringify({ firstNum, secondNum })
    const response = await fetch(API_URL+'/api/add', {
      method: 'POST',
      headers: {...HEADERS},
      body: requestBody
    })
    const {result} = await response.json()
    return result
  } catch (error) {
    console.log(error)
    return 0
  }
}