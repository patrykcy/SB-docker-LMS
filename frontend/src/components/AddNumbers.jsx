import { addNumbers } from "../utils/requests.js";
import { useState } from "react";


function AddNumbers() {

  const [firstNum, setFirstNum] = useState(0)
  const [secondNum, setSecondNum] = useState(0)
  const [addResult, setAddResult] = useState(0)

  return (
    <div className="card">
      <input type={'number'} placeholder={'First Number'} onChange={(event) => setFirstNum(parseInt(event.target.value)) }/>
      <br />
      <input type={'number'} placeholder={'Second Number'} onChange={(event) => setSecondNum(parseInt(event.target.value)) }/>
      <br />
      <input readOnly={true} value={`Sum equals ${addResult}`} />
      <br />
      <button onClick={async () => setAddResult(await addNumbers(firstNum, secondNum))}>
        Add numbers
      </button>
    </div>
  )
}

export default AddNumbers