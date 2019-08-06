import { Injectable } from '@angular/core';
import { Pessoa } from './model/pessoa.model';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class PessoaService {
  salvar(pessoa: Pessoa) {
    return this.http.post(`${environment.api}/pessoas/`, pessoa);
  }

  constructor(private http: HttpClient) {
  }
}
