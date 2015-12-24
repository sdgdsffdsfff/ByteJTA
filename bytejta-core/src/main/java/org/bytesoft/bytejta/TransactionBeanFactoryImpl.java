/**
 * Copyright 2014-2015 yangming.liu<liuyangming@gmail.com>.
 *
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, see <http://www.gnu.org/licenses/>.
 */
package org.bytesoft.bytejta;

import javax.transaction.TransactionManager;

import org.bytesoft.bytejta.common.TransactionBeanFactory;
import org.bytesoft.bytejta.common.TransactionRepository;
import org.bytesoft.bytejta.wire.TransactionManagerSkeleton;
import org.bytesoft.transaction.TransactionTimer;
import org.bytesoft.transaction.logger.TransactionLogger;
import org.bytesoft.transaction.logger.TransactionLoggerProxy;
import org.bytesoft.transaction.recovery.TransactionRecovery;
import org.bytesoft.transaction.rpc.TransactionInterceptor;
import org.bytesoft.transaction.xa.XidFactory;

public class TransactionBeanFactoryImpl implements TransactionBeanFactory {
	private TransactionManager transactionManager;
	private XidFactory xidFactory;
	private TransactionTimer transactionTimer;
	private final TransactionLoggerProxy transactionLogger = new TransactionLoggerProxy();
	private TransactionRepository<TransactionImpl> transactionRepository;
	private TransactionInterceptor transactionInterceptor;
	private TransactionRecovery transactionRecovery;
	private TransactionManagerSkeleton transactionManagerSkeleton;

	public void setTransactionLogger(TransactionLogger transactionLogger) {
		this.transactionLogger.setDelegate(transactionLogger);
	}

	public TransactionManager getTransactionManager() {
		return transactionManager;
	}

	public void setTransactionManager(TransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}

	public XidFactory getXidFactory() {
		return xidFactory;
	}

	public void setXidFactory(XidFactory xidFactory) {
		this.xidFactory = xidFactory;
	}

	public TransactionTimer getTransactionTimer() {
		return transactionTimer;
	}

	public void setTransactionTimer(TransactionTimer transactionTimer) {
		this.transactionTimer = transactionTimer;
	}

	@SuppressWarnings("unchecked")
	public TransactionRepository<TransactionImpl> getTransactionRepository() {
		return transactionRepository;
	}

	public void setTransactionRepository(TransactionRepository<TransactionImpl> transactionRepository) {
		this.transactionRepository = transactionRepository;
	}

	public TransactionInterceptor getTransactionInterceptor() {
		return transactionInterceptor;
	}

	public void setTransactionInterceptor(TransactionInterceptor transactionInterceptor) {
		this.transactionInterceptor = transactionInterceptor;
	}

	public TransactionRecovery getTransactionRecovery() {
		return transactionRecovery;
	}

	public void setTransactionRecovery(TransactionRecovery transactionRecovery) {
		this.transactionRecovery = transactionRecovery;
	}

	public TransactionManagerSkeleton getTransactionManagerSkeleton() {
		return transactionManagerSkeleton;
	}

	public void setTransactionManagerSkeleton(TransactionManagerSkeleton transactionManagerSkeleton) {
		this.transactionManagerSkeleton = transactionManagerSkeleton;
	}

	public TransactionLoggerProxy getTransactionLogger() {
		return transactionLogger;
	}

}