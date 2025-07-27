import '../Stylesheets/mystyle.css';

export function CalculateScore(props) {
  function percentToDecimal(total, goal) {
    return (total / goal) * 100;
  }

  function calcScore(total, goal) {
    return percentToDecimal(total, goal).toFixed(2);
  }

  return (
    <div className="formatstyle">
      <h2 className="Name">Name: {props.Name}</h2>
      <h2 className="School">School: {props.School}</h2>
      <h2 className="Total">Total: {props.total} Marks</h2>
      <h2 className="Score">Score: {calcScore(props.total, props.goal)}%</h2>
    </div>
  );
}
