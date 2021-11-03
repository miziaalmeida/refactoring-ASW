public class Fatura {
    private String cliente;
    private double valor;
    private List<Pagamento> pagamentos;
    private boolean pago;
    
    public Fatura(String cliente, double valor) {
        this.cliente = cliente;
        this.valor = valor;
        this.pagamentos = new ArrayList<Pagamento>();
        this.pago = false;
    }
 
    public String getCliente() {
        return cliente;
    }
 
    public double getValor() {
        return valor;
    }
 
    public List<Pagamento> getPagamentos() {
        return pagamentos;
    }
 
    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public void adicionaPagamento(Pagamento pagamento) {
        (this.pagamento).add(pagamento);
        
        if(valorTotalDosPagamentos()>this.valor){
            this.pago = true	
		}

	private double valorTotalDosPagamentos() {
        double total = 0;
        
        for(Pagamento p : pagamentos) {
            total += p.getValor();
		}
            return total;
	    }
    }
}