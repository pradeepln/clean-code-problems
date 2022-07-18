package exercise15.com.bank.dal;

import java.util.HashMap;
import java.util.Map;

import exercise15.com.bank.domain.Account;

public class AccountDAOInMemoryImpl implements AccountDAO {

	int counter = 0;
	Map<Integer, Account> db = new HashMap<Integer, Account>();

	@Override
	public Account getById(int id) {

		return db.get(id);
	}

	@Override
	public int create(Account account) {
		Integer id = ++counter;
		db.put(id, account);
		return id;
	}

	@Override
	public void update(Account account) {
		db.put(account.getId(), account);

	}

	@Override
	public void delete(int id) {
		db.remove(id);

	}

}
