package exercise15.com.bank.dal;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;

import exercise15.com.bank.domain.Account;

public class AccountDAOJpaImpl implements AccountDAO {

	EntityManager em;

	@Override
	public Account getById(int id) {

		return em.find(Account.class, id);
	}

	@Override
	public int create(Account account) {
		em.persist(account);
		return account.getId();
	}

	@Override
	public void update(Account account) {
		em.merge(account);

	}

	@Override
	public void delete(int id) {
		Account a = getById(id);
		em.remove(a);
	}

}
