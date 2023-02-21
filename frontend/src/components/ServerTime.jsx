import { getTime } from "../utils/requests.js";
import { useState } from "react";

function ServerTime() {

  const [time, setTime] = useState('unknown')

  return (
    <div className="card">
      <span>Last server time was {time}</span>
      <br/>
      <button onClick={async () => setTime(await getTime())}>
        Refresh server time
      </button>
    </div>
  )
}

export default ServerTime