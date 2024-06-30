import React from 'react';
import "./Homepage.css";
const Homepage = () => {
return (
    <div>
        <section className='-z-50  banner relative flex flex-col justify-center item'>
<div className=' w-[50vw] z-10 text-center'>
<p className='text-2xl lg:text-7xl font-bold z-10 py-5'>Swaad Food</p>
<p className='z-10  text-grey-300 text-xl lg:text-4xl'>Taste the Conveinance :Food,Fast and Delivered</p>
</div>
<div className="cover absolute top-0 left-0 right-0 "></div>
<div className="fadout"></div>
</section>
</div>
)
}

export default Homepage;

