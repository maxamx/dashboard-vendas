import BarCharts from './components/BarCharts';
import DataTable from './components/DataTable';
import DonutCharts from './components/DonutCharts';
import Footer from './components/Footer';
import NavBar from './components/NavBar';
function App() {
  return (
    <>
      <NavBar />
      <div className="container">
        <h1 className="text-primary py-3">Olá Mundo</h1>
        <div className="row px-3">

          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Taxa de vendas</h5>
            <BarCharts />
          </div>

          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Vendas</h5>
            <DonutCharts />
          </div>
        </div>

        <div className="py-3">
            <h2 className="text-primary">Lista</h2>
        </div>
        
        <DataTable />
      </div>
      <Footer />
    </>
  );
}

export default App;
