import React, { Component } from 'react'
import {Table ,Button } from 'react-bootstrap'

export default class BookHistory extends Component {

    constructor(props)
    {
        super(props)
        this.state={

            error:null,
            book:[]
        }
    }

    componentDidMount = ()=>{
        fetch("http://localhost:8080/allbook")
        .then(resp => resp.json())
        .then(
            (result)=>{
                this.setState({
                    book:result
                })
            },
            (error) => {
                this.setState({error})
            }
        )
    }


   
    render() {
        
        const {error ,book} = this.state;
        if(error)
        {
            return
            (
                <div>Error: {error.message}</div>
            )
        }
        else
        {
            return (
                <div>
                 <br/>
                    <p className="text-center">  </p>
                    <Table /*className="table table-bordered table-striped"*/>
                    <thead>

                        <tr>
                            <th colSpan={"1"}>
                                <h3> Booking Details</h3>
                            </th>      
                        </tr>
                        <tr>
                            <th>bid</th>
                            <th>book_date</th>
                            <th>amount</th>
                            <th>delivery_date</th>
                            <th>cid</th>
                            <th>payment_mode</th>
                                      
                        </tr>
                    </thead>
                    {book.map(obj =>(
                             <tr >
                                <td> {obj.bid} </td>
                                <td> {obj.book_date} </td>
                                <td> {obj.amount}</td>
                                <td> {obj.delivery_date} </td>
                                <td> {obj.cid} </td>
                                <td> {obj.payment_mode} </td>
                                
                                <td> <Button danger="info" /*onClick={()=>this.props.editCustomer(obj.cid)}*/>Cancel Booking</Button></td>
                             </tr>

                        ))}
                    </Table>
                </div>
            )
        }
 
    }
}