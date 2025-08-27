select * from java_categoria;
select * from java_despesa;

update java_categoria set categoria = 'abc' where id_categoria = 2;
delete from java_categoria where id_categoria = 2;

roollback; -- só funciona se não der o commit

select d.descricao, d.valor, d.data, c.categoria
from java_despesa d
inner join java_categoria c
on d.id_categoria = c.id_categoria;

create sequence seqc start with 500 increment by 1;
create sequence seqd start with 1000 increment by 1;

insert into java_categoria values (seqc.nextval, 'educação');