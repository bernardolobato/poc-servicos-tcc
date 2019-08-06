import { Component } from '@angular/core';
import { Pessoa } from './model/pessoa.model';
import { PessoaService } from './pessoa.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'poc-servicos';
  pessoa: Pessoa = new Pessoa();

  constructor(private service: PessoaService) {

  }
  salvar() {
    const arrayDate = this.pessoa.dataNascimento.split('/');
    // tslint:disable-next-line: radix
    const date = new Date(parseInt(arrayDate[2]), parseInt(arrayDate[1]) - 1, parseInt(arrayDate[0]));
    this.pessoa.dataNascimento = date;
    this.service.salvar(this.pessoa).pipe().subscribe((res) => {
      alert('Cadastro realizado com sucesso!');
    },
      (err) => {
        console.log(err);
        console.log('Ocorreu um erro.');
      });
  }


  formatar(mascara, documento) {
    const i = documento.value.length;
    const saida = mascara.substring(0, 1);
    const texto = mascara.substring(i);

    if (texto.substring(0, 1) !== saida) {
      documento.value += texto.substring(0, 1);
    }

  }
}
