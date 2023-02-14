use reqwest::blocking::get;

fn main() -> Result<(), reqwest::Error> {
    let url = "https://www.dell.com";
    
    for _ in 0..1000 {
        let response = get(url)?;
        println!("{}", response.status());
    }
    
    Ok(())
}