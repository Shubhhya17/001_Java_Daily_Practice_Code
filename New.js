import React, { useState } from "react";
const setSome = () => {
    const [msg, setMsg] = useState('');


    const New = () => {
        setMsg("You Double Click the Botton.");
    }
    return (
        <>
            <button onClick={New}>Click hear </button>
            <p>{msg} </p>
        </>
    )
}