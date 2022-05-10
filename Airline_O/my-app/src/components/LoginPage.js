import { useState } from "react";
import { Link, useHistory, useParams } from "react-router-dom";
import { useEffect } from "react/cjs/react.development";
import airlineService from "../services/airline.service";
import './Ansar.css'

const LoginPage = () => {
    const[email, setEmail] = useState('');
    const[password, setPassword] = useState('');

   const[users,setUsers] = useState([])
    const history = useHistory();
    const {id} = useParams();

    const loginUser = (e) => {
        e.preventDefault();
         
        if(email=="" || password===""){
            if(email===""){
                document.getElementById('vemail').innerText="Enter Your Email Id"
            }
            else{
                document.getElementById('vemail').innerText=""
            }
    
            if(password===""){
                document.getElementById('vpassword').innerText="Enter Your Password"
            }
            else{
                document.getElementById('vpassword').innerText=""
            }
        }
        
            
        else{
            users.map((user)=>{
            if(user.type==="user" &&  email === user.email && password === user.password){
                    console.log("User Login successfully");
                    history.push("/UserPage");
            }
           else if(user.type === "admin" && email === user.email && password === user.password){
                console.log("Admin Login successfully");
                history.push("/AdminPage");
            }
           else if(user.type === "owner" && email === user.email && password === user.password){
                console.log("Owner Login successfully");
                history.push("/OwnerPage");
                
            }
            else{
               document.getElementById('invalid').innerText="INVALID CREDIENTIALS"

            }
        
        
        });
    }
        
        }

    useEffect(() => {
        airlineService.getAllUsers()
        .then(response => {
          console.log('Printing Users data', response.data);
          setUsers(response.data);
        })
        .catch(error => {
          console.log('Something went wrong', error);
        }) 
        }, [])
    return(
        <div className="body">
            <div class="container">
            
            <h3 class="loginhead">Login</h3>
            <p id="invalid"></p>
            <hr/>
            <form>
            <div className="form-group">
                    <input 
                        type="email" 
                        className="form-control col-4"
                        id="email"
                        value={email}
                        onChange={(e) => setEmail(e.target.value)}
                        placeholder="ENTER EMAIL ID"
                    />
                    <p id="vemail"></p>
                </div>
                <div className="form-group">
                    <input 
                        type="password" 
                        className="form-control col-4"
                        id="password"
                        value={password}
                        onChange={(e) => setPassword(e.target.value)}
                        placeholder="ENTER PASSWORD"
                    />
                    <p id="vpassword"></p>
                </div>

                <div >
                    <br></br>
                    <button onClick={(e) => loginUser(e)} className="btn btn-primary">Submit</button>
                </div>
            </form>
            <hr/>
            <Link to="/forgotpassword" style={{color:"darkblue"}}> Forgot Password</Link>
            <br></br>
            
            <Link to="/register" style={{color:"darkblue"}}>Not Registered Yet? Register Now</Link>
            </div>
        </div>
    )
}

export default LoginPage;