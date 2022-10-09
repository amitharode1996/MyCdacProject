package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Booking;
import com.example.demo.entities.Customer;
import com.example.demo.entities.Distributor;
import com.example.demo.entities.Login;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	@Query("select c from Customer c where  login_tbl= :l")
	Optional<Customer> findcustomer(Login l);

	/*Optional<Customer> findByConsumer(int consumer);
	List<Booking> getMyBooking(int consumerId);
*/
	
/**/
//	@Query("select s from Customer s where cid = ?1")
	//public List<Customer> getByCid(int cid);
	
	
	/*@Modifying
	@Query(value="select c from customer  c where cid=?1",nativeQuery=true)
	public Customer getOneUsingCid(int cid);
*/
}
