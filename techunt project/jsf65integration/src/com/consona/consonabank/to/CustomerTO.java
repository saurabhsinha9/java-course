package com.consona.consonabank.to;
public class CustomerTO {

		private int cid;
		private String cname;
		private String email;
		private long phone;
		private String city;
		private String username;
		private String password;
		private AccountTO accountTO;
		
		public CustomerTO()
		{
			System.out.println("def cons of CustomerTO class");
		}

		public CustomerTO(int cid,String cname, String email, long phone, String city,
				String username, String password) {
			super();
			this.cid=cid;
			this.cname = cname;
			this.email = email;
			this.phone = phone;
			this.city = city;
			this.username = username;
			this.password = password;
		}

		public int getCid() {
			return cid;
		}

		public void setCid(int cid) {
			this.cid = cid;
		}

		public String getCname() {
			return cname;
		}

		public void setCname(String cname) {
			this.cname = cname;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public long getPhone() {
			return phone;
		}

		public void setPhone(long phone) {
			this.phone = phone;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public AccountTO getAccountTO() {
			return accountTO;
		}

		public void setAccountTO(AccountTO accountTO) {
			this.accountTO = accountTO;
		}
		
		
	}



