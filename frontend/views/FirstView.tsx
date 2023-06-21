import {useEffect, useState} from "react";
import First from "First.ts";
import {FirstEndpoint} from "../generated/endpoints.ts";


export function FirstView(){
  const [first, setFirst] = useState<First[]>([]);
  const [task, setTask] = useState('')

  useEffect(()=> {FirstEndpoint.findAll().then(setFirst)},[])

return (
<div>
    <h2>Wow</h2>

    <div>
    </div>
</div>
  );
}