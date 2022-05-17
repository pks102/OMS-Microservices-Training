
package demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "CUSTOMER_TB")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull(message="customer id should not be null")
	private Long customerId;
	@NotNull
	@Size(min=3 ,message="Minimum 3 characters required")
	private String customerName;
	@NotNull
	private Boolean active;
	@Email(message="email should be a valid one")
	private String email;
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public Boolean getActive() {
		return active;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}


}
