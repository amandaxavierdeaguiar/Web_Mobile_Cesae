@extends('layout.femaster')

@section('content')
<h1>Aqui tens todas as tarefas</h1>

<table class="table">
    <thead>
      <tr>
        <th scope="col">id</th>
        <th scope="col">Nome</th>
        <th scope="col">Estado</th>
        <th scope="col">Data de Conclusão</th>
        <th scope="col">User</th>
      </tr>
    </thead>
    <tbody>
        @foreach ($tasks as $task)
            <tr>
                <th scope="row">{{$task->id}}</th>
                <td>{{$task->name}}</td>
                <td>{{$task->status}}</td>
                <td>{{$task->due_at}}</td>
                <td>{{$task->username}}</td>
            </tr>
        @endforeach
    </tbody>
  </table>

@endsection
