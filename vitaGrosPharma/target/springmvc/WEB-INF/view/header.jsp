<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Navbar</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="/owners/list">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/vits/list">Vits and Specialies</a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-expanded="false">
          Owners
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="/owners/add">Add</a>
          <a class="dropdown-item" href="/owners/list">list</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="/owners/search">search</a>
        </div>
      </li>
      <li class="nav-item">
        <a class="nav-link disabled">logout</a>
      </li>
    </ul>
    <form class="form-inline my-2 my-lg-0" method="get" action="/owners/search2">
      <input class="form-control mr-sm-2" name="lastname" type="search" placeholder="Search owner by lastname" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
</nav>
