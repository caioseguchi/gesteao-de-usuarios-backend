insert into manage_users.cvs_usuario(id,nome, login, senha, email)
value(1,"exemplo","exemplologin", "123456", "exemplo@email.com");
insert into manage_users.cvs_usuario(id,nome, login, senha, email)
value(2,"Luci","lucisouza", "123456", "lucilenejs88@gmail.com");


insert into manage_users.cvc_perfil(id, descricao)
value (1, "Administrador");
insert into manage_users.cvc_perfil(id, descricao)
value (2, "Gerente");
insert into manage_users.cvc_perfil(id, descricao)
value (3, "Cliente");

insert into manage_users.cvs_recursos(id, chave, nome)
value(1, "Tela Usuario","usuario");
insert into manage_users.cvs_recursos(id, chave, nome)
value(2, "Tela Perfil","perfil");
insert into manage_users.cvs_recursos(id, chave, nome)
value(3, "Tela Recurso","recurso");