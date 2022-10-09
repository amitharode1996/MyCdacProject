import React from "react";
export default class feedback extends React.Component {

    constructor(props) {
        super(props);
        this.state={
           
            complaint_desc:""
            
        }
    }

    handleChange=(e) =>{
        let nm = e.target.name;
        let val =e.target.value;
        this.setState({[nm]:val});

    }



       // creating Rest API 
       submitReq =(e)=>{
        e.preventDefault();
        console.log(this.state);

        const reqData = {
            method : 'POST',
            headers : {
                'Content-Type': 'application/json',
                'Access-Control-Allow-Origin':'*'
            },
            // given attribute must match exactly with the entity property !
            body:JSON.stringify({
                
                feedback_desc:this.state.feedback_desc
            })
        } ;

        fetch("http://localhost:8080/savecomplaint",reqData)
        .then(resp => resp.json())
        .then(data =>this.setState({complain:data , success : true }));
        alert("Feedback Submitted");

    }
    render() {
        return (
            <div>
            
            <div className="container"><br />
                    <h1 className="text-danger  text-center" >Give your Feedback</h1><br></br>

                    <div className="col-lg-8 m-auto d-block"></div>
            <br/>

            <form onSubmit={this.submitReq} className="bg-light" id="feedback">
                            
            <br></br>

            <div className="form-group" >
                <label className="text-info  text-center"><h3><strong>Feedback Description :</strong></h3></label><br/><br/>
                <textarea name="feedback_desc" form="feeback"   className="form-control" autoComplete="off" value={this.state.description} onChange={this.handleChange} placeholder="Enter feedback here"></textarea>
                                   
                                    
            </div>
                
            <br></br>
            <input type="submit"  value="Feedback" className="btn btn-success" onClick={this.submitReq}/>
            </form>
            <br/>

    
                

                    

                   
                

            </div>
            </div>
        );
    }
}


