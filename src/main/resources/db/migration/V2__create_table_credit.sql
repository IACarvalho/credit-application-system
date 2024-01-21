CREATE TABLE credit (
  id UUID NOT NULL,
   credit_value DECIMAL NOT NULL,
   day_first_installment date NOT NULL,
   number_of_installments INTEGER NOT NULL,
   status SMALLINT,
   customer_id UUID,
   CONSTRAINT pk_credit PRIMARY KEY (id)
);

ALTER TABLE credit ADD CONSTRAINT FK_CREDIT_ON_CUSTOMER FOREIGN KEY (customer_id) REFERENCES customer (id);